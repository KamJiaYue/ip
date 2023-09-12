package seedu.duke.command;

import seedu.duke.TaskList;
import seedu.duke.Ui;

public class ListCommand extends Command {
    @Override
    public void execute(TaskList taskList, Ui ui, String[] response) throws Exception {
        response[0] = taskList.listOutEverything();
    }
}