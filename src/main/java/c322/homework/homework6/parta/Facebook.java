package c322.homework.homework6.parta;

import java.util.ArrayList;
import java.util.List;

class Facebook implements SocialNetwork {
    List<Profile> profiles;

    public Facebook(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public boolean hasMore() {
        return profiles.iterator().hasNext();
    }

    public Profile getNext() {
        return profiles.iterator().next();
    }
    public List<String> requestProfileFriends(String profileId, String type) {
        // implementation to return a list of profile ids for friends of the given profileId
        return new ArrayList<String>();
    }

    public Profile requestProfile(String profileId) {
        // implementation to return a Profile object for the given profileId
        for (Profile profile : profiles) {
            if (profile.getId().equals(profileId)) {
                return profile;
            }
        }
        return null;
    }

}