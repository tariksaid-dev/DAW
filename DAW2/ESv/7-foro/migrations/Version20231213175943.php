<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20231213175943 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE comment ADD tema_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE comment ADD CONSTRAINT FK_9474526CA64A8A17 FOREIGN KEY (tema_id) REFERENCES tema (id)');
        $this->addSql('CREATE INDEX IDX_9474526CA64A8A17 ON comment (tema_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE comment DROP FOREIGN KEY FK_9474526CA64A8A17');
        $this->addSql('DROP INDEX IDX_9474526CA64A8A17 ON comment');
        $this->addSql('ALTER TABLE comment DROP tema_id');
    }
}
