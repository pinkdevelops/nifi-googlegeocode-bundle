package org.apache.nifi.processors.googlegeocode.util;

public class Area {
        private Location southWest;
        private Location northEast;

        public Location getSouthWest() {
            return southWest;
        }

        public void setSouthWest(Location southWest) {
            this.southWest = southWest;
        }

        public Location getNorthEast() {
            return northEast;
        }

        public void setNorthEast(Location northEast) {
            this.northEast = northEast;
        }
    }
