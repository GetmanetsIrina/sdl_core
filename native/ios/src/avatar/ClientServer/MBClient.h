//
//  MBClient.h
//  MsgBrokerTest
//
//  Created by Eugene Nikolsky on 6/27/12.
//  Copyright (c) 2012 Luxoft. All rights reserved.
//

#import <Foundation/Foundation.h>

/* The client class that works with the message broker
 via a server. */
@interface MBClient : NSObject

// The constructor you should use
- (id)initWithHost:(NSString *)host andPort:(uint16_t)port;

// Connects to the specified host and port.
- (BOOL)connect;

// Disconnects from the server.
- (void)disconnect;


// The method is called when the client has connected to the server.
// Subclasses can override it.
- (void)didConnect;

// Sends the data to the server.
- (void)sendData:(NSData *)data;

// Receives data from the server.
// Child classes should override it.
- (void)receiveData:(NSData *)data;

@end
