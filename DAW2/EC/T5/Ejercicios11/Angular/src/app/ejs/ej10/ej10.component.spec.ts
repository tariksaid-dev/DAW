import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ej10Component } from './ej10.component';

describe('Ej10Component', () => {
  let component: Ej10Component;
  let fixture: ComponentFixture<Ej10Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Ej10Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Ej10Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
