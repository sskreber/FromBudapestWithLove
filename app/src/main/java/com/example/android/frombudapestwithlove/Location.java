package com.example.android.frombudapestwithlove;

public class Location {

    private String name;
    private String address;
    private int locationImageId;
    private String description;
    private static final int NO_PHOTO_AVAILABLE = -1;

    private int locationHugeImageId;

    public Location(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.locationImageId = NO_PHOTO_AVAILABLE;
        this.description = description;
    }

    public Location(String name, String address, int locationImageId, int locationHugeImageId, String description) {
        this.name = name;
        this.address = address;
        this.locationImageId = locationImageId;
        this.locationHugeImageId = locationHugeImageId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getLocationImageId() {
        return locationImageId;
    }

    public int getLocationHugeImageId() {
        return locationHugeImageId;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasImage() {
        return locationImageId != NO_PHOTO_AVAILABLE;
    }
}
