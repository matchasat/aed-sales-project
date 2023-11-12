/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Channels;

/**
 *
 * @author smatcha
 */
public class Channels {
    private String channelType;
    private String channelDescription;

    public Channels(String channelType, String channelDescription) {
        this.channelType = channelType;
        this.channelDescription = channelDescription;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    @Override
    public String toString() {
        return "Channels{" +
                "channelType='" + channelType + '\'' +
                ", channelDescription='" + channelDescription + '\'' +
                '}';
    }
}

