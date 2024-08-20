class Codec:

    hashmap = {}

    def encode(self, longUrl: str) -> str:
        """Encodes a URL to a shortened URL.
        """
        index = longUrl.rfind("/")
        hashValue = hash(longUrl)
        shortUrl = longUrl[:index] + str(hashValue)
        self.hashmap[shortUrl] = longUrl

        return shortUrl
        

    def decode(self, shortUrl: str) -> str:
        """Decodes a shortened URL to its original URL.
        """
        return self.hashmap[shortUrl]        

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))