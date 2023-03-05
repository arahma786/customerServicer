// SocialSpammer.java
package c322.homework.homework6.parta;

import java.util.List;

class SocialSpammer extends Facebook implements Iterator {
    public SocialSpammer(List<Profile> profiles) {
        super(profiles);
    }

    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            String email = profile.getEmail();
            // send email with message to email address
        }
    }
}
