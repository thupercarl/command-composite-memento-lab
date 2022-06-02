package commands;

import entities.StringStorage;

import java.util.Locale;

public class Capitalize implements ICommand
{
    //store receiver
    private StringStorage source;

    public Capitalize(StringStorage source) {
        this.source = source;
    }

    @Override
    public void execute()
    {
        String data = source.getData();
        data = data.toUpperCase();
        source.setData(data);
    }
}
