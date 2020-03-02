package com.ethan.gen;

import com.ethan.core.*;
import java.util.*;

public class RandomNotes
{
    public static List<Note> gen01() 
    {
        Random rand = new Random();
        List<Note> out = new ArrayList<>();
        int t = 0;
        for (int i = 0; i < 50; i++) 
        {
            int pitch = 30 + rand.nextInt(50);
            out.add(new Note(t, t + 200, pitch));
            t += 300;
        }
        return out;
    }
}