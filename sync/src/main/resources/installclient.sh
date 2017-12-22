#!/bin/sh

# Your Initial Access Token
ACCESS_TOKEN="eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI3Yjk3ZmYxNi0xNWRhLTQ5NDItYmQ2Ni0wYzM4ODg1Njc3NzUiLCJleHAiOjE1Mzg3NTM5NDMsIm5iZiI6MCwiaWF0IjoxNTA3MjE3OTQzLCJpc3MiOiJodHRwOi8vc3NvLXNzby1hcHAtZGVtby4xOTIuMTY4Ljk5LjEwMC5uaXAuaW8vYXV0aC9yZWFsbXMvM1NjYWxlIiwiYXVkIjoiaHR0cDovL3Nzby1zc28tYXBwLWRlbW8uMTkyLjE2OC45OS4xMDAubmlwLmlvL2F1dGgvcmVhbG1zLzNTY2FsZSIsInR5cCI6IkluaXRpYWxBY2Nlc3NUb2tlbiJ9.eg75Amxr4fOanT7xaCKj4JrsfO-BYOpVZnvWsVcwjSh66m0q6Wnji0yq3xy4dXgVc196PfVMLCORsUswEj8QrEFp6-1---Qadqk8PI24d2CKGRnR00EThuWeZS-0S43-4iS0CXfBzoOYVL-ZxmrmrEpYECaPObkJPh0Vaoa2zZLbqVrtvHM3lb2ub1bOJypzdb72GPuf6VS8iIMSg5tsXH0JXD1wPmgkPMezPpRz7jLnNHOopYhfeAjLLD4_eopocfWoGEkPrN_zlJ_Se9S8Q4uMU3W1l5Ykmbb5ubbAqY8JO78Wk5dCMDPaF1G5C6avFDHA2O8FIMgC6pa4hja8tw"

# The RH-SSO Realm
REALM="3scale"

# The Hostname of the Secure Route of RH-SSO
SSO_HOST="sso-sso-app-demo.192.168.99.100.nip.io"

# The parameters of the application you created in 3scale
CLIENT_ID="a7029963"
CLIENT_SECRET="56a97585e64ebbbeaae968dd93ae1a62"
REDIRECT_URL="https://www.getpostman.com/oauth2/callback"

curl -X POST -d "{ \"clientId\": \"$CLIENT_ID\", \"secret\": \"$CLIENT_SECRET\", \"redirectUris\":[ \"$REDIRECT_URL\" ] }" -H "Content-Type:application/json" -H "Accept: application/json" -H "Authorization:Bearer $ACCESS_TOKEN" --insecure "http://$SSO_HOST/auth/realms/$REALM/clients-registrations/default" 