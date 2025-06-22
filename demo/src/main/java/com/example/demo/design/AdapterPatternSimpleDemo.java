package com.example.demo.design;

//The Adapter Pattern is a structural design pattern in Java allows incompatible interfaces to work together
// by acting as a bridge

//Adapter (PlugAdapter): Converts USPlug calls to EUPlug calls
    class PlugAdapter implements USPlug {
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

    //Client: Uses USPlug interface to connect, unaware of the adaptation.
        public class AdapterPatternSimpleDemo {
        public static void main(String[] args) {
            EUPlug euPlug = new EUPlug();
            USPlug adapter = new PlugAdapter(euPlug);

            // Client uses USPlug interface
            adapter.connectToUSSocket();
        }
    }

