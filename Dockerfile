FROM alpine:latest
LABEL maintainer="ben@benweese.dev"

RUN apk --no-cache add \
    curl \
    git \
    vim \
    chromium \
    chromium-chromedriver \
    openjdk11 \
    maven \