package my.fin.project.model.entity.pojo;

public class Element {
    private Duration duration;

    private Distance distance;

    private String status;

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Element{" +
                "duration=" + duration +
                ", distance=" + distance +
                ", status='" + status + '\'' +
                '}';
    }
}
