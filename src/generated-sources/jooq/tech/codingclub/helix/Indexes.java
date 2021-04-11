/*
 * This file is generated by jOOQ.
*/
package tech.codingclub.helix;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;

import tech.codingclub.helix.tables.Follower;
import tech.codingclub.helix.tables.Member;
import tech.codingclub.helix.tables.Music;
import tech.codingclub.helix.tables.Tweet;


/**
 * A class modelling indexes of tables of the <code>twitter</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FOLLOWER_KEY2_IDX = Indexes0.FOLLOWER_KEY2_IDX;
    public static final Index FOLLOWER_UNIQUE_INDEX = Indexes0.FOLLOWER_UNIQUE_INDEX;
    public static final Index FOLLOWER_USER_ID = Indexes0.FOLLOWER_USER_ID;
    public static final Index FOLLOWER_USER_ID_2 = Indexes0.FOLLOWER_USER_ID_2;
    public static final Index MEMBER_EMAIL_UNIQUE = Indexes0.MEMBER_EMAIL_UNIQUE;
    public static final Index MEMBER_PRIMARY = Indexes0.MEMBER_PRIMARY;
    public static final Index MUSIC_CHILD_LINK_UNIQUE = Indexes0.MUSIC_CHILD_LINK_UNIQUE;
    public static final Index TWEET_PRIMARY = Indexes0.TWEET_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index FOLLOWER_KEY2_IDX = createIndex("key2_idx", Follower.FOLLOWER, new OrderField[] { Follower.FOLLOWER.FOLLOWING_ID }, false);
        public static Index FOLLOWER_UNIQUE_INDEX = createIndex("unique_index", Follower.FOLLOWER, new OrderField[] { Follower.FOLLOWER.USER_ID, Follower.FOLLOWER.FOLLOWING_ID }, true);
        public static Index FOLLOWER_USER_ID = createIndex("user_id", Follower.FOLLOWER, new OrderField[] { Follower.FOLLOWER.USER_ID, Follower.FOLLOWER.FOLLOWING_ID }, false);
        public static Index FOLLOWER_USER_ID_2 = createIndex("user_id_2", Follower.FOLLOWER, new OrderField[] { Follower.FOLLOWER.USER_ID, Follower.FOLLOWER.FOLLOWING_ID }, false);
        public static Index MEMBER_EMAIL_UNIQUE = createIndex("email_UNIQUE", Member.MEMBER, new OrderField[] { Member.MEMBER.EMAIL }, true);
        public static Index MEMBER_PRIMARY = createIndex("PRIMARY", Member.MEMBER, new OrderField[] { Member.MEMBER.ID }, true);
        public static Index MUSIC_CHILD_LINK_UNIQUE = createIndex("child_link_UNIQUE", Music.MUSIC, new OrderField[] { Music.MUSIC.CHILD_LINK }, true);
        public static Index TWEET_PRIMARY = createIndex("PRIMARY", Tweet.TWEET, new OrderField[] { Tweet.TWEET.ID }, true);
    }
}