package c322.homework.homework6.parta;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
