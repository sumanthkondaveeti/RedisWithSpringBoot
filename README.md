# RedisWithSpringBoot
using Springboot to create APIs for inserting and retrieval of hash sets in REDIS.


This is Standalone Java application using springboot and Redis where I created API to insert values into Redis and another API to retrieve the values inserted. The values inserted into Redis is Hash Set data Structure. 

# How to run:

 * We need to run as standalone java Application.
 * Make sure you install Redis on your local machine on port 6379.
 * Use Redis Desktop Manager to see your key-value pairs inserted into Redis.
 * Download redis Desktop Manager From https://redisdesktop.com/download and use localhost and port 6379 to connect with local redis.
 * We can set Redis expiration time which removes the key-value pair from Redis Cluster.
 

**Insert Hash set into Redis :**

http://localhost:8080/Insertintoredis

**Body**

{
	"key": "anykey",
	"value": {
		"firstname": "sam",
		"lastname": "curran"
	},
	"expiration": 10000
}

**get Hash set from Redis :**

http://localhost:8080/gethashmap/anykey

**output**

{
    "status": "OK",
    "data": {
        "firstname": "sam",
        "lastname": "curran"
    }
}

============**Things to Do**=======

Expand This with Redis Set and Lists.
