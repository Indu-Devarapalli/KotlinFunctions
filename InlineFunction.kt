package com.example.myapplication


fun main() {

    // Inline
    println("Boiling water, adding tea leaves, sugar...")  // Directly inlined!
    makeTea1 {
        println("Boiling water, adding tea leaves, sugar...") //without inline
    }

    //NoInline
    //  Define the lambda
    val myTask: () -> Unit = {
        println("Doing the task...")
    }

    //  Pass it to the inline function
    runTask("Simple Work", myTask)

    // Reuse the lambda again
    println("Now running the task again manually:")
    myTask()

    // crosslined

    println("Main start")
    safeRun {
        println("Inside block")
        // return  Not allowed — blocked by crossinline
        println("Still inside block")
    }
    println("Main continues")
    Thread.sleep(100)
}

// InLine
inline fun makeTea(action: () -> Unit) {  // with inline
    action()
}
fun makeTea1(action: () -> Unit) {   //without inline
    action()
}

//Noline

inline fun runTask(taskName: String, noinline task: () -> Unit) {
    println("Starting task: $taskName")
    task()  // This lambda is NOT inlined
    println("Finished task: $taskName")
}

//crosslined

inline fun safeRun(crossinline block: () -> Unit) {
    println("Before block")
    Thread {
        block()  // Executing the lambda inside a new thread
    }.start()
    println("After thread start")
}