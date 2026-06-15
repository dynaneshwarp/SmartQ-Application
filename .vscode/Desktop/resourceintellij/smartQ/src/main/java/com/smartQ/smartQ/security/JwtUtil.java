package com.smartQ.smartQ.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import java.security.Key;
import java.util.Date;
@Component
public class JwtUtil {

    // Secret Key

    private final String SECRET =
            "smartqsecretkeysmartqsecretkey";

    // Generate Token

    public String generateToken(
            String email) {

        return Jwts.builder()

                .setSubject(email)

                .setIssuedAt(
                        new Date()
                )

                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 60
                        )
                )

                .signWith(
                        getSignKey(),
                        SignatureAlgorithm.HS256
                )

                .compact();
    }

    // Extract Email

    public String extractEmail(
            String token) {

        return Jwts.parserBuilder()

                .setSigningKey(
                        getSignKey()
                )

                .build()

                .parseClaimsJws(token)

                .getBody()

                .getSubject();
    }

    // Secret Key Conversion

    private Key getSignKey() {

        return Keys.hmacShaKeyFor(
                SECRET.getBytes()
        );
    }
}

