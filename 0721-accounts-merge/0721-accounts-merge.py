class UnionFind:

    def __init__(self, size):
        self.parent = [i for i in range(size)]
        self.rank = [1] * size

    def find(self, x):
        if x == self.parent[x]:
            return x
        self.parent[x] = self.find(self.parent[x])
        return self.parent[x]
    
    def union(self, x, y):
        xr = self.find(x)
        yr = self.find(y)

        if xr != yr:
            if self.rank[xr] > self.rank[yr]:
                self.parent[yr] = xr
            elif self.rank[xr] < self.rank[yr]:
                self.parent[xr] = yr
            else:
                self.parent[yr] = xr
                self.rank[yr] += 1

class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        uf = UnionFind(len(accounts))

        emailToAccount = dict()
        for accountId, accountData in enumerate(accounts):
            for i in range(1, len(accountData)):
                email = accountData[i] 
                if email in emailToAccount:
                    uf.union(accountId, emailToAccount[email])
                else:
                    emailToAccount[email] = accountId 
        
        groupByAccount = defaultdict(list)

        for email, accountId in emailToAccount.items():
            parentAccountId = uf.find(accountId)
            groupByAccount[parentAccountId].append(email)

        res = []
        for accountId, emails in groupByAccount.items():
            data = [accounts[accountId][0]]
            data.extend(sorted(emails))
            res.append(data)
        return res