FROM gradle:7.6.0-jdk17

WORKDIR /app

COPY . .

CMD ["gradle", "localTests"]