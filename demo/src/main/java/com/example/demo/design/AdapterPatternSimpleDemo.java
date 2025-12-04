package com.example.demo.design;

//The Adapter Pattern is a structural design pattern in Java allows incompatible interfaces to work together
// by acting as a bridge

//Client: Uses USPlug interface to connect, unaware of the adaptation.
        public class AdapterPatternSimpleDemo {
        public static void main(String[] args) {
            EUPlug euPlug = new EUPlug();
            USPlug adapter = new PlugAdapter(euPlug);

            // Client uses USPlug interface
            adapter.connectToUSSocket();
        }
    }

