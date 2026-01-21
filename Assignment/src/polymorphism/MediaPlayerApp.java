package polymorphism;

class MediaFile {
    void play() {
        System.out.println("Playing media");
    }
}

class AudioFile extends MediaFile {
    void play() {
        System.out.println("Playing Audio File");
    }
}

class VideoFile extends MediaFile {
    void play() {
        System.out.println("Playing Video File");
    }
}

class Podcast extends MediaFile {
    void play() {
        System.out.println("Playing Podcast");
    }
}

class MediaPlayerApp {
    public static void main(String[] args) {
        MediaFile m;

        m = new AudioFile();
        m.play();

        m = new VideoFile();
        m.play();

        m = new Podcast();
        m.play();
    }
}