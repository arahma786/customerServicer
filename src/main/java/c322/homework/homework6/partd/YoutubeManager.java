package c322.homework.homework6.partd;
import java.util.Map;

public class YoutubeManager implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();

    @Override
    public Map<String, Video> listVideos() {
        return service.listVideos();
    }

    @Override
    public Video getVideoInfo(String id) {
        return service.getVideoInfo(id);
    }

    @Override
    public void downloadVideo(String id) {
        service.downloadVideo(id);
    }
}
