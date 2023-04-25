package com.company.java17to20.java17.subclassing;

// allow Dog. This sends a message that "Lizard" shouldn't extend it
public sealed class Mammal permits Dog {
}
