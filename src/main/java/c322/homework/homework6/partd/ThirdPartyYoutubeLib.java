package c322.homework.homework6.partd;
import java.util.Map;

public interface ThirdPartyYoutubeLib {
    Map<String, Video> listVideos();

    Video getVideoInfo(String id);

    void downloadVideo(String id);
}

