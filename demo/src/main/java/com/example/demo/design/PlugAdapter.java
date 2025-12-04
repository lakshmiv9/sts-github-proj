package com.example.demo.design;

//Adapter (PlugAdapter): Converts USPlug calls to EUPlug calls
public class PlugAdapter implements USPlug {
        private EUPlug euPlug;

        public PlugAdapter(EUPlug euPlug) {
            this.euPlug = euPlug;
        }

        @Override
        public void connectToUSSocket() {
            // Adapts US plug to EU plug
            euPlug.connectToEUSocket();
        }
    }
