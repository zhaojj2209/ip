package duke.tasks;

import duke.DukeException;

public abstract class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Task constructor
     *
     * @param description Description string
     * @param isDone Completion status of task
     */
    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getStatusIcon() {
        return (this.isDone ? "\u2713" : "\u2718");
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public abstract void edit(String editInput) throws DukeException;
}
