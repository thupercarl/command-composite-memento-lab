package commands;

import entities.StringStorage;

import java.util.Random;

public class Randomize implements ICommand
{
    //store receiver
    private StringStorage source;

    public Randomize(StringStorage source) {
        this.source = source;
    }

    @Override
    public void execute()
    {
        Random rand = new Random();
        char[] letters = source.getData().toCharArray();

        for (int i = 0; i < letters.length; i++)
        {
            int different = rand.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[different];
            letters[different] = temp;
        }
        source.setData(new String(letters));
    }
}
