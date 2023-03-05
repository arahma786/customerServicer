package c322.homework.homework6.parta;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition = 0;
    private List<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = new ArrayList<>();
            List<String> profileIds = facebook.requestProfileFriends(profileId, type);
            for (String profileId : profileIds) {
                cache.add(facebook.requestProfile(profileId));
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return currentPosition < cache.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        Profile profile = cache.get(currentPosition);
        currentPosition++;
        return profile;
    }

    @Override
    public boolean hasMore() {
        return false;
    }

    @Override
    public void reset() {

    }
}
