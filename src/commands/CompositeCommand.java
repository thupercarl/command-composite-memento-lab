package commands;

public class CompositeCommand implements ICommand
{
    private ICommand[] children;

    public CompositeCommand(ICommand[] children) {
        this.children = children;
    }

    @Override
    public void execute()
    {
        for (int j = 0; j < children.length; j++)
        {
            children[j].execute();
        }
    }
}
