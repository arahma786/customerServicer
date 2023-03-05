package c322.homework.homework6.partd;
import java.util.HashMap;
import java.util.Map;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib service;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheAll = new HashMap<>();

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public Map<String, Video> listVideos() {
        if (cacheAll.isEmpty()) {
            cacheAll = service.listVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cacheAll;
    }

    @Override
    public Video getVideoInfo(String id) {
        Video video = cachePopular.get(id);
        if (video == null) {
            video = cacheAll.get(id);
            if (video == null) {
                video = service.getVideoInfo(id);
                cacheAll.put(id, video);
            }
            cachePopular.put(id, video);
        } else {
            System.out.println("Retrieved video from cache.");
        }
        return video;
    }

    @Override
    public void downloadVideo(String id) {
        service.downloadVideo(id);
    }
}
