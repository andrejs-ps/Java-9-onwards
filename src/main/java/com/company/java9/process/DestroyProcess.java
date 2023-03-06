package com.company.java9.process;

import static com.company.common.Utils.print;

public class DestroyProcess {

    /**
     * On Windows: start the native Notepad app and run this program
     * For other Operating systems: open an equivalent app and change the .filter() line below
     */
    public static void main(String... args) {

        // 1) Find and print the process
        ProcessHandle notePadHandle =
                ProcessHandle.allProcesses()
                        .filter(
                                h -> h.info().command().map(s -> s.contains("Notepad.exe")).orElse(false)
                        )
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("No matching handle found"));

        print(notePadHandle.info());

        // 2) Set up a listener in advance - if the process exits - inform us!
        notePadHandle.onExit()  // Returns an async CompletableFuture (Promise)
                .thenAccept(h -> print("Notepad.exe was killed by Java!"));

        //3) End the process
        boolean shutdown = notePadHandle.destroy();

        // to avoid a race condition, make the current thread wait for the CompletableFuture before this  program exits
        notePadHandle.onExit().join();
        print("Shutdown: " + shutdown);
    }
}