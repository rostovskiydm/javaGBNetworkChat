package ru.gb.javafxnetworkchat.javafxnetworkchat.server;

import java.io.Closeable;

public interface AuthService extends Closeable {
    String getNickByLoginAndPassword(String login, String password);
}
