FROM alpine:latest
LABEL maintainer="ben@benweese.dev"

RUN apk --no-cache && apk add \
    curl \
    git \
    vim \
    chromium \
    chromium-chromedriver \
    openjdk11 \
    maven \