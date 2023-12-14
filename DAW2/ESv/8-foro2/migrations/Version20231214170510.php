<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20231214170510 extends AbstractMigration
{
    public function getDescription(): string
    {
        return '';
    }

    public function up(Schema $schema): void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE comment ADD user_id INT NOT NULL, ADD tema_id INT NOT NULL');
        $this->addSql('ALTER TABLE comment ADD CONSTRAINT FK_9474526CA76ED395 FOREIGN KEY (user_id) REFERENCES `user` (id)');
        $this->addSql('ALTER TABLE comment ADD CONSTRAINT FK_9474526CA64A8A17 FOREIGN KEY (tema_id) REFERENCES tema (id)');
        $this->addSql('CREATE INDEX IDX_9474526CA76ED395 ON comment (user_id)');
        $this->addSql('CREATE INDEX IDX_9474526CA64A8A17 ON comment (tema_id)');
        $this->addSql('ALTER TABLE tema ADD user_id INT NOT NULL, ADD foro_id INT NOT NULL');
        $this->addSql('ALTER TABLE tema ADD CONSTRAINT FK_61E3A538A76ED395 FOREIGN KEY (user_id) REFERENCES `user` (id)');
        $this->addSql('ALTER TABLE tema ADD CONSTRAINT FK_61E3A538F5FF53F6 FOREIGN KEY (foro_id) REFERENCES foro (id)');
        $this->addSql('CREATE INDEX IDX_61E3A538A76ED395 ON tema (user_id)');
        $this->addSql('CREATE INDEX IDX_61E3A538F5FF53F6 ON tema (foro_id)');
    }

    public function down(Schema $schema): void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE tema DROP FOREIGN KEY FK_61E3A538A76ED395');
        $this->addSql('ALTER TABLE tema DROP FOREIGN KEY FK_61E3A538F5FF53F6');
        $this->addSql('DROP INDEX IDX_61E3A538A76ED395 ON tema');
        $this->addSql('DROP INDEX IDX_61E3A538F5FF53F6 ON tema');
        $this->addSql('ALTER TABLE tema DROP user_id, DROP foro_id');
        $this->addSql('ALTER TABLE comment DROP FOREIGN KEY FK_9474526CA76ED395');
        $this->addSql('ALTER TABLE comment DROP FOREIGN KEY FK_9474526CA64A8A17');
        $this->addSql('DROP INDEX IDX_9474526CA76ED395 ON comment');
        $this->addSql('DROP INDEX IDX_9474526CA64A8A17 ON comment');
        $this->addSql('ALTER TABLE comment DROP user_id, DROP tema_id');
    }
}
