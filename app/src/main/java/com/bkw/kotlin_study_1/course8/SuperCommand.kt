package com.bkw.kotlin_study_1.course8

sealed class SuperCommand {
    object A : SuperCommand()
    object B : SuperCommand()
    object C : SuperCommand()
    object D : SuperCommand()
}

fun exec(superCommand: SuperCommand) {
    when (superCommand) {
        SuperCommand.A -> {
        }
        SuperCommand.B -> {
        }
        SuperCommand.C -> {
        }
        SuperCommand.D -> {
        }
    }
}