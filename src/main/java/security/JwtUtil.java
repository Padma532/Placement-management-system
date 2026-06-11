package security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {

    private static final SecretKey KEY =
            Keys.hmacShaKeyFor(
                    "placementmanagementsystemjwtsecretkey123456"
                            .getBytes());

    public String generateToken(String email) {

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 86400000))
                .signWith(KEY)
                .compact();
    }

    public String extractUsername(String token) {
    	return Jwts.parserBuilder()
    	        .setSigningKey(KEY)
    	        .build()
    	        .parseClaimsJws(token)
    	        .getBody()
    	        .getSubject();
    }
}