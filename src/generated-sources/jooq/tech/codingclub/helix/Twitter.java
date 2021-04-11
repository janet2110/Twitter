/*
 * This file is generated by jOOQ.
*/
package tech.codingclub.helix;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import tech.codingclub.helix.tables.Coders;
import tech.codingclub.helix.tables.Follower;
import tech.codingclub.helix.tables.Member;
import tech.codingclub.helix.tables.Music;
import tech.codingclub.helix.tables.Tweet;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Twitter extends SchemaImpl {

    private static final long serialVersionUID = -330532264;

    /**
     * The reference instance of <code>twitter</code>
     */
    public static final Twitter TWITTER = new Twitter();

    /**
     * The table <code>twitter.coders</code>.
     */
    public final Coders CODERS = tech.codingclub.helix.tables.Coders.CODERS;

    /**
     * The table <code>twitter.follower</code>.
     */
    public final Follower FOLLOWER = tech.codingclub.helix.tables.Follower.FOLLOWER;

    /**
     * The table <code>twitter.member</code>.
     */
    public final Member MEMBER = tech.codingclub.helix.tables.Member.MEMBER;

    /**
     * The table <code>twitter.music</code>.
     */
    public final Music MUSIC = tech.codingclub.helix.tables.Music.MUSIC;

    /**
     * The table <code>twitter.tweet</code>.
     */
    public final Tweet TWEET = tech.codingclub.helix.tables.Tweet.TWEET;

    /**
     * No further instances allowed
     */
    private Twitter() {
        super("twitter", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Coders.CODERS,
            Follower.FOLLOWER,
            Member.MEMBER,
            Music.MUSIC,
            Tweet.TWEET);
    }
}
