/*
 * This file is generated by jOOQ.
*/
package tech.codingclub.helix;


import javax.annotation.Generated;

import tech.codingclub.helix.tables.Coders;
import tech.codingclub.helix.tables.Follower;
import tech.codingclub.helix.tables.Member;
import tech.codingclub.helix.tables.Music;
import tech.codingclub.helix.tables.Tweet;


/**
 * Convenience access to all tables in twitter
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>twitter.coders</code>.
     */
    public static final Coders CODERS = tech.codingclub.helix.tables.Coders.CODERS;

    /**
     * The table <code>twitter.follower</code>.
     */
    public static final Follower FOLLOWER = tech.codingclub.helix.tables.Follower.FOLLOWER;

    /**
     * The table <code>twitter.member</code>.
     */
    public static final Member MEMBER = tech.codingclub.helix.tables.Member.MEMBER;

    /**
     * The table <code>twitter.music</code>.
     */
    public static final Music MUSIC = tech.codingclub.helix.tables.Music.MUSIC;

    /**
     * The table <code>twitter.tweet</code>.
     */
    public static final Tweet TWEET = tech.codingclub.helix.tables.Tweet.TWEET;
}
