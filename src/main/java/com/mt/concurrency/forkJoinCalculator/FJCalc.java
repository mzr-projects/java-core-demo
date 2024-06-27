package com.mt.concurrency.forkJoinCalculator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/*
 * The fork/join framework meant to encourage partitioning of a problem into subproblems
 * Its suites for recursive structures such as trees whose parts are likewise trees
 *
 * The fork in fork/join api announces a subproblem suited for a new thread
 * The join aggregates the results from the work of the threads.
 * */
public class FJCalc extends RecursiveTask<Integer> {

    private final Integer n;

    public FJCalc(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n <= 1) {
            return n;
        }

        List<FJCalc> tasks = new ArrayList<>();
        FJCalc fjCalc = new FJCalc(n - 1);
        /*
         * Here it will allocate a thread to the task
         * */
        fjCalc.fork();
        tasks.add(fjCalc);

        assembleResults(tasks);

        return n * n;
    }

    private void assembleResults(List<FJCalc> tasks) {
        for (FJCalc task : tasks) {
            System.out.println(Thread.currentThread().getName());
            Collection<Integer> result = Collections.singleton(task.join());
            System.out.println(STR."result is : \{result}");
        }
    }
}
