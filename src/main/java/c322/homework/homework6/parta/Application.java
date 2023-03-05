package c322.homework.homework6.parta;

import java.util.List;

public class Application extends Facebook implements Iterator {
    private SocialSpammer spammer;
    private SocialNetwork network;

    public Application(List<Profile> profiles) {
        super(profiles);
        this.spammer = new SocialSpammer(profiles);
        this.network = new Facebook(profiles);
    }

    public void sendSpamToFriends(String profileId) {
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "Check out this product!");
    }

    public void sendSpamToCoworkers(String profileId) {
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "Join our company's new initiative!");
    }
}