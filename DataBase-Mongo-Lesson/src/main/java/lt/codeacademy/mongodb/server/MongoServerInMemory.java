package lt.codeacademy.mongodb.server;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfig;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

import java.io.IOException;
import java.util.Scanner;

public class MongoServerInMemory {
    public static void main(String[] args) throws IOException {


        runnServer();

    }

    private static void runnServer() throws IOException {
        MongodStarter starter = MongodStarter.getDefaultInstance();

        int port = 12345;//Network.getFreeServerPort();
        MongodConfig mongodConfig = MongodConfig.builder()
                .version(Version.Main.PRODUCTION)
                .net(new Net(port, Network.localhostIsIPv6()))
                .build();

        MongodExecutable mongodExecutable = null;
        try {
            mongodExecutable = starter.prepare(mongodConfig);
            MongodProcess mongod = mongodExecutable.start();

            String text;
            do {
                System.out.println("Press enter 'exit' to terminate server");
                text = new Scanner(System.in).nextLine();
            } while (!text.equals("exit"));

        } finally {
            if (mongodExecutable != null)
                mongodExecutable.stop();
        }
    }
}
