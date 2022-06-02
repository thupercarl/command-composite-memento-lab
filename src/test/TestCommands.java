package test;

import commands.*;
import entities.StringStorage;

public class TestCommands
{
    public static void main(String[] args)
    {
        StringStorage sentence = new StringStorage("The quick brown fox jumped over the lazy dog");

        StringStorage.Memento memento = sentence.createMemento();

        //cmds
        ICommand[] cmds = {
                new ReplaceVowels(sentence),
                new CompositeCommand(new ICommand[] {
                        new Randomize(sentence),
                        new Capitalize(sentence)
                })
        };

        //execute in series
        for (int i = 0; i < cmds.length; i++)
        {
            cmds[i].execute();
            System.out.println(sentence);
        }

        //rollback
        sentence.setMemento(memento);
        System.out.println(sentence);
    }
}
