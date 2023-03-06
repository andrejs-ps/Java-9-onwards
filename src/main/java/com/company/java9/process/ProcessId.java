package com.company.java9.process;

import java.time.Instant;
import java.util.Comparator;

import static com.company.common.Utils.print;

public class ProcessId {

    /**
     * The new Process API that allows you to manage and control operating system processes
     */
    public static void main(String... args) {

        long currentProcessId = ProcessHandle.current().pid();
        System.out.printf("pid: %s ", currentProcessId);

        print("================================");

        ProcessHandle.allProcesses()
                .map(ProcessHandle::info)
                .sorted(Comparator.comparing(info ->
                        info.startInstant().orElse(Instant.MAX)))
                .limit(10)
                .forEach(ProcessId::printInfo);

    }

    private static void printInfo(ProcessHandle.Info info) {
        if (info.startInstant().isPresent() && info.command().isPresent() && info.user().isPresent()) {
            print("Started at: " + info.startInstant().get() +
                    ", Command: " + info.command().get() +
                    ", By user: " + info.user().get()
            );
        }
    }
}