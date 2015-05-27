/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.com;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelException;

import java.net.InetSocketAddress;

public class Connection
{
    private Channel channel;
    private InetSocketAddress socketAddress;

    public Connection( InetSocketAddress socketAddress, Channel channel )
    {
        this.socketAddress = socketAddress;
        this.channel = channel;
    }

    public Channel getChannel()
    {
        return channel;
    }

    public InetSocketAddress getSocketAddress()
    {
        return socketAddress;
    }
}
