/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Channels;

import Business.Channels.Channels;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class ChannelDirectory {
    private ArrayList<Channels> channelList;

    public ChannelDirectory() {
        this.channelList = new ArrayList<>();
    }

    public void addChannel(Channels channel) {
        this.channelList.add(channel);
    }

    public Channels getChannel(int index) {
        return this.channelList.get(index);
    }

    public int getNumberOfChannels() {
        return this.channelList.size();
    }

    public ArrayList<Channels> getAllChannels() {
        return this.channelList;
    }

    public void removeChannel(Channels channel) {
        this.channelList.remove(channel);
    }

    @Override
    public String toString() {
        String channelString = "";
        for (Channels channel : channelList) {
            channelString += channel.toString() + "\n";
        }
        return channelString;
    }
}

