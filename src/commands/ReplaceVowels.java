package commands;

import entities.StringStorage;

public class ReplaceVowels implements ICommand
{
    //store receiver
    private StringStorage source;

    public ReplaceVowels(StringStorage source) {
        this.source = source;
    }

    @Override
    public void execute()
    {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String data = source.getData();
        for (int i = 0; i < vowels.length; i++)
        {
            data = data.replace(vowels[i], '*');
        }
        source.setData(data);
    }
}
