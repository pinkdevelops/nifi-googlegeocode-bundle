package org.apache.nifi.processors.googlegeocode.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dpinkston on 12/28/16.
 */
public class GeocodeResults {

        private String status;
        private List<Geocode> results = new ArrayList<Geocode>();

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setResults(List<Geocode> results) {
            this.results = results;
        }

        public List<Geocode> getResults() {
            return results;
        }
    }
