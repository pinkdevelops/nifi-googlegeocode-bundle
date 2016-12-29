package org.apache.nifi.processors.googlegeocode.util;

import java.util.ArrayList;
import java.util.Collection;

public class AddressComponent {
        private String longName;
        private String shortName;
        private Collection<String> types = new ArrayList<String>();

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public Collection<String> getTypes() {
            return types;
        }

        public void setTypes(Collection<String> types) {
            this.types = types;
        }
    }
