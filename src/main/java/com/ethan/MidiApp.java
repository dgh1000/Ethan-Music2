package com.ethan;

import javax.sound.midi.*;
import java.util.*;
import com.ethan.core.*;
import com.ethan.gen.*;
import com.ethan.midi.*;

public class MidiApp 
{
    public static void test02() throws Exception
    {
        List<Note> ns = new ArrayList<>();
        ns.add(new Note(0, 1000, 60));

        Map<String, String> env = System.getenv();
        String midiInputName = env.get("MMIDI");
        if (midiInputName == null)
            throw new Exception("the MMIDI env variable isn't defined");
        MidiInterface.openMidiDevice(midiInputName);
        MidiInterface.playNotes(ns, new ArrayList<Raw>(), 1000);
        MidiInterface.closeMidiDevice();

    }

    public static void test03() throws Exception
    {
        List<Note> ns = RandomNotes.gen01();
        Map<String, String> env = System.getenv();
        String midiInputName = env.get("MMIDI");
        if (midiInputName == null)
            throw new Exception("the MMIDI env variable isn't defined");
        MidiInterface.openMidiDevice(midiInputName);
        MidiInterface.playNotes(ns, new ArrayList<Raw>(), 1000);
        MidiInterface.closeMidiDevice();

    }
}
