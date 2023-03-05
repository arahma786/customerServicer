package c322.homework.homework6.partd;

import java.util.HashMap;
import java.util.Map;


public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public Map<String, Video> listVideos() {
        // Fetches videos from the Internet
        return new HashMap<>();
    }

    @Override
    public Video getVideoInfo(String id) {

        return new Video();
    }

    @Override
    public void downloadVideo(String id) {
    }
}
