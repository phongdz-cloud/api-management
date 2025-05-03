package com.example.common.constants;

public class SecurityConstants {
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SECRET = "your-256-bit-secret-key-here-must-be-at-least-32-characters-long";
    public static final long EXPIRATION_TIME = 86400000; // 24 hours
    public static final long REFRESH_TOKEN_EXPIRATION_TIME = 604800000; // 7 days
} 