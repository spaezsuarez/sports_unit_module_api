/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     07/08/2022 12:40:21 p. m.                    */
/*==============================================================*/

create user SPORTS_UNIT identified by m5S5AUC4ScE7;

grant create table to SPORTS_UNIT;

alter table SPORTS_UNIT.ASISMIEMBROEQUIPO
    drop constraint FK_ASISMIEM_MIEMBRO_A_MIEMBROE;

alter table SPORTS_UNIT.ASISMIEMBROEQUIPO
    drop constraint FK_ASISMIEM_PROGRAMAC_PROGRAMA;

alter table SPORTS_UNIT.ASISTIRRESPONSABLE
    drop constraint FK_ASISTIRR_RESPONSAB_RESPONSA;

alter table SPORTS_UNIT.DEPORTE_TIPO
    drop constraint FK_DEPORTE__DEPORTE_T_DEPORTE;

alter table SPORTS_UNIT.DEPORTE_TIPO
    drop constraint FK_DEPORTE__DEPORTE_T_TIPOELEM;

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    drop constraint FK_ELEMENTO_ELEMENTO__ESTADO;

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    drop constraint FK_ELEMENTO_ELEMENTO__TIPOELEM;

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    drop constraint FK_ELEMENTO_ESPACIO_E_ESPACIO;

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    drop constraint FK_ELEMENTO_MARCA_ELE_MARCA;

alter table SPORTS_UNIT.EMPLEADO_CARGO
    drop constraint FK_EMPLEADO_CARGO_EMP_CARGO;

alter table SPORTS_UNIT.EMPLEADO_CARGO
    drop constraint FK_EMPLEADO_EMPLEADO__EMPLEADO;

alter table SPORTS_UNIT.EMPLEADO_CARGO
    drop constraint FK_EMPLEADO_ESPACIO_E_ESPACIO;

alter table SPORTS_UNIT.EQUIPO
    drop constraint FK_EQUIPO_EMPLEADO__EMPLEADO;

alter table SPORTS_UNIT.EQUIPO
    drop constraint FK_EQUIPO_EQUIPO_DE_DEPORTE;

alter table SPORTS_UNIT.ESPACIO
    drop constraint FK_ESPACIO_ESPACIO_E_ESPACIO;

alter table SPORTS_UNIT.ESPACIO
    drop constraint FK_ESPACIO_TIPO_ESPA_TIPOESPA;

alter table SPORTS_UNIT.ESPACIO_DEPORTE
    drop constraint FK_ESPACIO__ESPACIO_D_ESPACIO;

alter table SPORTS_UNIT.ESPACIO_DEPORTE
    drop constraint FK_ESPACIO__ESPACIO_D_DEPORTE;

alter table SPORTS_UNIT.ESTUDIANTE
    drop constraint FK_ESTUDIAN_ESPACIO_E_ESPACIO;

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    drop constraint FK_INSCRITO_EMPLEADO__EMPLEADO;

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    drop constraint FK_INSCRITO_ESTUDIANT_ESTUDIAN;

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    drop constraint FK_INSCRITO_PROGRAMAC_PROGRAMA;

alter table SPORTS_UNIT.MIEMBROEQUIPO
    drop constraint FK_MIEMBROE_ESTUDIANT_ESTUDIAN;

alter table SPORTS_UNIT.MIEMBROEQUIPO
    drop constraint FK_MIEMBROE_MIEMBRO_E_EQUIPO;

alter table SPORTS_UNIT.PRESTAMO
    drop constraint FK_PRESTAMO_ASISTIRRE_ASISTIRR;

alter table SPORTS_UNIT.PRESTAMO
    drop constraint FK_PRESTAMO_ELEMENTOD_ELEMENTO;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_ACTIVIDAD_ACTIVIDA;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_DEPORTE_P_DEPORTE;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_DIA_PROGR_DIA;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_ESPACIO_P_ESPACIO;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_HORAFIN_HORA;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_HORAINICI_HORA;

alter table SPORTS_UNIT.PROGRAMACION
    drop constraint FK_PROGRAMA_PERIODO_P_PERIODO;

alter table SPORTS_UNIT.RESPONSABLE
    drop constraint FK_RESPONSA_EMPLEADO__EMPLEADO;

alter table SPORTS_UNIT.RESPONSABLE
    drop constraint FK_RESPONSA_ESTUDIANT_ESTUDIAN;

alter table SPORTS_UNIT.RESPONSABLE
    drop constraint FK_RESPONSA_PROGRAMAC_PROGRAMA;

alter table SPORTS_UNIT.RESPONSABLE
    drop constraint FK_RESPONSA_ROL_RESPO_ROL;

drop table SPORTS_UNIT.ACTIVIDAD cascade constraints;

drop index SPORTS_UNIT.PROG_ASISMIEMEQ_FK;

drop index SPORTS_UNIT.MIEMBRO_ASIS_FK;

drop table SPORTS_UNIT.ASISMIEMBROEQUIPO cascade constraints;

drop index SPORTS_UNIT.RESPON_ASISTIRRESPON_FK;

drop table SPORTS_UNIT.ASISTIRRESPONSABLE cascade constraints;

drop table SPORTS_UNIT.CARGO cascade constraints;

drop table SPORTS_UNIT.DEPORTE cascade constraints;

drop index SPORTS_UNIT.DEPORTE_TIPO_FK;

drop index SPORTS_UNIT.DEPORTE_TIPO2_FK;

drop table SPORTS_UNIT.DEPORTE_TIPO cascade constraints;

drop table SPORTS_UNIT.DIA cascade constraints;

drop index SPORTS_UNIT.MARCA_ELEMENTO_FK;

drop index SPORTS_UNIT.ESPACIO_ELEMENTO_FK;

drop index SPORTS_UNIT.ELEMENTO_ESTADO_FK;

drop index SPORTS_UNIT.ELEMENTO_TIPO_FK;

drop table SPORTS_UNIT.ELEMENTODEPORTIVO cascade constraints;

drop table SPORTS_UNIT.EMPLEADO cascade constraints;

drop index SPORTS_UNIT.EMPLEADO_EMPLEADO_CARGO_FK;

drop index SPORTS_UNIT.ESPACIO_EMPLEADO_CARGO_FK;

drop index SPORTS_UNIT.CARGO_EMPLEADO_CARGO_FK;

drop table SPORTS_UNIT.EMPLEADO_CARGO cascade constraints;

drop index SPORTS_UNIT.EMPLEADO_EQUIPO_FK;

drop index SPORTS_UNIT.EQUIPO_DEPORTE_FK;

drop table SPORTS_UNIT.EQUIPO cascade constraints;

drop index SPORTS_UNIT.ESPACIO_ESPACIO_FK;

drop index SPORTS_UNIT.TIPO_ESPACIO_FK;

drop table SPORTS_UNIT.ESPACIO cascade constraints;

drop index SPORTS_UNIT.ESPACIO_DEPORTE_FK;

drop index SPORTS_UNIT.ESPACIO_DEPORTE2_FK;

drop table SPORTS_UNIT.ESPACIO_DEPORTE cascade constraints;

drop table SPORTS_UNIT.ESTADO cascade constraints;

drop index SPORTS_UNIT.ESPACIO_ESTUDIANTE_FK;

drop table SPORTS_UNIT.ESTUDIANTE cascade constraints;

drop table SPORTS_UNIT.HORA cascade constraints;

drop index SPORTS_UNIT.PROG_INSCRITO_FK;

drop index SPORTS_UNIT.EMPLEADO_INSCRITOPRACLIBRE_FK;

drop index SPORTS_UNIT.ESTUD_INSCRITO_FK;

drop table SPORTS_UNIT.INSCRITOPRACLIBRE cascade constraints;

drop table SPORTS_UNIT.MARCA cascade constraints;

drop index SPORTS_UNIT.ESTUDIANTE_EQUIPO_FK;

drop index SPORTS_UNIT.MIEMBRO_EQUIPO_FK;

drop table SPORTS_UNIT.MIEMBROEQUIPO cascade constraints;

drop table SPORTS_UNIT.PERIODO cascade constraints;

drop index SPORTS_UNIT.ELEMENTODEPORTIVO_PRESTAMO_FK;

drop index SPORTS_UNIT.ASISTIRRESPONSABLE_FK;

drop table SPORTS_UNIT.PRESTAMO cascade constraints;

drop index SPORTS_UNIT.DIA_PROGRAMACION_FK;

drop index SPORTS_UNIT.HORAINICIO_FK;

drop index SPORTS_UNIT.HORAFIN_FK;

drop index SPORTS_UNIT.ACTIVIDAD_PROGRAMACION_FK;

drop index SPORTS_UNIT.PERIODO_PROGRAMACION_FK;

drop index SPORTS_UNIT.ESPACIO_PROGRAMACION_FK;

drop index SPORTS_UNIT.DEPORTE_PROGRAMACION_FK;

drop table SPORTS_UNIT.PROGRAMACION cascade constraints;

drop index SPORTS_UNIT.PROGRAMACION_RESPONSABLE_FK;

drop index SPORTS_UNIT.ESTUDIANTE_RESPONSABLE_FK;

drop index SPORTS_UNIT.EMPLEADO_RESPONSABLE_FK;

drop index SPORTS_UNIT.ROL_RESPONSABLE_FK;

drop table SPORTS_UNIT.RESPONSABLE cascade constraints;

drop table SPORTS_UNIT.ROL cascade constraints;

drop table SPORTS_UNIT.TIPOELEMENTO cascade constraints;

drop table SPORTS_UNIT.TIPOESPACIO cascade constraints;

/*==============================================================*/
/* Table: ACTIVIDAD                                             */
/*==============================================================*/
create table SPORTS_UNIT.ACTIVIDAD
(
    IDACTIVIDAD          VARCHAR2(2)          not null,
    DESCACTIVIDAD        VARCHAR2(30)         not null,
    constraint PK_ACTIVIDAD primary key (IDACTIVIDAD)
);

/*==============================================================*/
/* Table: ASISMIEMBROEQUIPO                                     */
/*==============================================================*/
create table SPORTS_UNIT.ASISMIEMBROEQUIPO
(
    CONSECPROGRA         NUMBER(4,0)          not null,
    CONMIEMEQUIPO        NUMBER(4,0)          not null,
    CONSEEQUIPO          NUMBER(3,0),
    ITEMMIEMBRO          NUMBER(3,0),
    constraint PK_ASISMIEMBROEQUIPO primary key (CONSECPROGRA, CONMIEMEQUIPO)
);

/*==============================================================*/
/* Index: MIEMBRO_ASIS_FK                                       */
/*==============================================================*/
create index SPORTS_UNIT.MIEMBRO_ASIS_FK on SPORTS_UNIT.ASISMIEMBROEQUIPO (
                                                                           CONSEEQUIPO ASC,
                                                                           ITEMMIEMBRO ASC
    );

/*==============================================================*/
/* Index: PROG_ASISMIEMEQ_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.PROG_ASISMIEMEQ_FK on SPORTS_UNIT.ASISMIEMBROEQUIPO (
                                                                              CONSECPROGRA ASC
    );

/*==============================================================*/
/* Table: ASISTIRRESPONSABLE                                    */
/*==============================================================*/
create table SPORTS_UNIT.ASISTIRRESPONSABLE
(
    CONSECPROGRA         NUMBER(4,0)          not null,
    CONSECRES            NUMBER(4,0)          not null,
    CONSECASISRES        NUMBER(4)            not null,
    FECHAASISRES         DATE                 not null,
    HORAASISRES          DATE                 not null,
    constraint PK_ASISTIRRESPONSABLE primary key (CONSECPROGRA, CONSECRES, CONSECASISRES)
);

/*==============================================================*/
/* Index: RESPON_ASISTIRRESPON_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.RESPON_ASISTIRRESPON_FK on SPORTS_UNIT.ASISTIRRESPONSABLE (
                                                                                    CONSECPROGRA ASC,
                                                                                    CONSECRES ASC
    );

/*==============================================================*/
/* Table: CARGO                                                 */
/*==============================================================*/
create table SPORTS_UNIT.CARGO
(
    IDCARGO              VARCHAR2(2)          not null,
    DESCARGO             VARCHAR2(20)         not null,
    constraint PK_CARGO primary key (IDCARGO)
);

/*==============================================================*/
/* Table: DEPORTE                                               */
/*==============================================================*/
create table SPORTS_UNIT.DEPORTE
(
    IDDEPORTE            VARCHAR2(2)          not null,
    NOMDEPORTE           VARCHAR2(20)         not null,
    constraint PK_DEPORTE primary key (IDDEPORTE)
);

/*==============================================================*/
/* Table: DEPORTE_TIPO                                          */
/*==============================================================*/
create table SPORTS_UNIT.DEPORTE_TIPO
(
    IDDEPORTE            VARCHAR2(2)          not null,
    IDTIPOELEMENTO       VARCHAR2(2)          not null,
    constraint PK_DEPORTE_TIPO primary key (IDDEPORTE, IDTIPOELEMENTO)
);

/*==============================================================*/
/* Index: DEPORTE_TIPO2_FK                                      */
/*==============================================================*/
create index SPORTS_UNIT.DEPORTE_TIPO2_FK on SPORTS_UNIT.DEPORTE_TIPO (
                                                                       IDTIPOELEMENTO ASC
    );

/*==============================================================*/
/* Index: DEPORTE_TIPO_FK                                       */
/*==============================================================*/
create index SPORTS_UNIT.DEPORTE_TIPO_FK on SPORTS_UNIT.DEPORTE_TIPO (
                                                                      IDDEPORTE ASC
    );

/*==============================================================*/
/* Table: DIA                                                   */
/*==============================================================*/
create table SPORTS_UNIT.DIA
(
    IDDIA                VARCHAR2(1)          not null,
    NOMDIA               VARCHAR2(10)         not null,
    constraint PK_DIA primary key (IDDIA)
);

/*==============================================================*/
/* Table: ELEMENTODEPORTIVO                                     */
/*==============================================================*/
create table SPORTS_UNIT.ELEMENTODEPORTIVO
(
    CONSECELEMENTO       NUMBER(5)            not null,
    IDTIPOELEMENTO       VARCHAR2(2),
    IDESTADO             VARCHAR2(2),
    CODESPACIO           VARCHAR2(2),
    IDMARCA              VARCHAR2(2),
    FECHAREGISTROELEMENTO DATE                 not null,
    constraint PK_ELEMENTODEPORTIVO primary key (CONSECELEMENTO)
);

/*==============================================================*/
/* Index: ELEMENTO_TIPO_FK                                      */
/*==============================================================*/
create index SPORTS_UNIT.ELEMENTO_TIPO_FK on SPORTS_UNIT.ELEMENTODEPORTIVO (
                                                                            IDTIPOELEMENTO ASC
    );

/*==============================================================*/
/* Index: ELEMENTO_ESTADO_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.ELEMENTO_ESTADO_FK on SPORTS_UNIT.ELEMENTODEPORTIVO (
                                                                              IDESTADO ASC
    );

/*==============================================================*/
/* Index: ESPACIO_ELEMENTO_FK                                   */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_ELEMENTO_FK on SPORTS_UNIT.ELEMENTODEPORTIVO (
                                                                               CODESPACIO ASC
    );

/*==============================================================*/
/* Index: MARCA_ELEMENTO_FK                                     */
/*==============================================================*/
create index SPORTS_UNIT.MARCA_ELEMENTO_FK on SPORTS_UNIT.ELEMENTODEPORTIVO (
                                                                             IDMARCA ASC
    );

/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table SPORTS_UNIT.EMPLEADO
(
    CODEMPLEADO          VARCHAR2(4)          not null,
    NOMEMPLEADO          VARCHAR2(20)         not null,
    APELLEMPLEADO        VARCHAR2(20)         not null,
    FECHAREGISTROEMPLEADO DATE                 not null,
    CORREOUD             VARCHAR2(30)         not null,
    constraint PK_EMPLEADO primary key (CODEMPLEADO)
);

/*==============================================================*/
/* Table: EMPLEADO_CARGO                                        */
/*==============================================================*/
create table SPORTS_UNIT.EMPLEADO_CARGO
(
    CONSEC               NUMBER(3)            not null,
    IDCARGO              VARCHAR2(2),
    CODESPACIO           VARCHAR2(2),
    CODEMPLEADO          VARCHAR2(4),
    FECHACARGO           DATE                 not null,
    FECHAFINCAR          DATE,
    constraint PK_EMPLEADO_CARGO primary key (CONSEC)
);

/*==============================================================*/
/* Index: CARGO_EMPLEADO_CARGO_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.CARGO_EMPLEADO_CARGO_FK on SPORTS_UNIT.EMPLEADO_CARGO (
                                                                                IDCARGO ASC
    );

/*==============================================================*/
/* Index: ESPACIO_EMPLEADO_CARGO_FK                             */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_EMPLEADO_CARGO_FK on SPORTS_UNIT.EMPLEADO_CARGO (
                                                                                  CODESPACIO ASC
    );

/*==============================================================*/
/* Index: EMPLEADO_EMPLEADO_CARGO_FK                            */
/*==============================================================*/
create index SPORTS_UNIT.EMPLEADO_EMPLEADO_CARGO_FK on SPORTS_UNIT.EMPLEADO_CARGO (
                                                                                   CODEMPLEADO ASC
    );

/*==============================================================*/
/* Table: EQUIPO                                                */
/*==============================================================*/
create table SPORTS_UNIT.EQUIPO
(
    CONSEEQUIPO          NUMBER(3,0)          not null,
    IDDEPORTE            VARCHAR2(2),
    CODEMPLEADO          VARCHAR2(4),
    FECHARESOL           DATE                 not null,
    constraint PK_EQUIPO primary key (CONSEEQUIPO)
);

/*==============================================================*/
/* Index: EQUIPO_DEPORTE_FK                                     */
/*==============================================================*/
create index SPORTS_UNIT.EQUIPO_DEPORTE_FK on SPORTS_UNIT.EQUIPO (
                                          IDDEPORTE ASC
    );

/*==============================================================*/
/* Index: EMPLEADO_EQUIPO_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.EMPLEADO_EQUIPO_FK on SPORTS_UNIT.EQUIPO (
                                                                   CODEMPLEADO ASC
    );

/*==============================================================*/
/* Table: ESPACIO                                               */
/*==============================================================*/
create table SPORTS_UNIT.ESPACIO
(
    CODESPACIO           VARCHAR2(2)          not null,
    IDTIPOESPACIO        VARCHAR2(2),
    ESP_CODESPACIO       VARCHAR2(2),
    NOMESPACIO           VARCHAR2(30)         not null,
    constraint PK_ESPACIO primary key (CODESPACIO)
);

/*==============================================================*/
/* Index: TIPO_ESPACIO_FK                                       */
/*==============================================================*/
create index SPORTS_UNIT.TIPO_ESPACIO_FK on SPORTS_UNIT.ESPACIO (
                                                                 IDTIPOESPACIO ASC
    );

/*==============================================================*/
/* Index: ESPACIO_ESPACIO_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_ESPACIO_FK on SPORTS_UNIT.ESPACIO (
                                                                    ESP_CODESPACIO ASC
    );

/*==============================================================*/
/* Table: ESPACIO_DEPORTE                                       */
/*==============================================================*/
create table SPORTS_UNIT.ESPACIO_DEPORTE
(
    CODESPACIO           VARCHAR2(2)          not null,
    IDDEPORTE            VARCHAR2(2)          not null,
    constraint PK_ESPACIO_DEPORTE primary key (CODESPACIO, IDDEPORTE)
);

/*==============================================================*/
/* Index: ESPACIO_DEPORTE2_FK                                   */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_DEPORTE2_FK on SPORTS_UNIT.ESPACIO_DEPORTE (
                                                                             IDDEPORTE ASC
    );

/*==============================================================*/
/* Index: ESPACIO_DEPORTE_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_DEPORTE_FK on SPORTS_UNIT.ESPACIO_DEPORTE (
                                                                            CODESPACIO ASC
    );

/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table SPORTS_UNIT.ESTADO
(
    IDESTADO             VARCHAR2(2)          not null,
    DESCESTADO           VARCHAR2(20)         not null,
    constraint PK_ESTADO primary key (IDESTADO)
);

/*==============================================================*/
/* Table: ESTUDIANTE                                            */
/*==============================================================*/
create table SPORTS_UNIT.ESTUDIANTE
(
    CODESTU              VARCHAR2(12)         not null,
    CODESPACIO           VARCHAR2(2),
    NOMESTU              VARCHAR2(30)         not null,
    APELLESTU            VARCHAR2(30)         not null,
    FECHAREGESTU         DATE                 not null,
    CORREOUDESTU         VARCHAR2(30)         not null,
    FECHANACESTU         DATE                 not null,
    constraint PK_ESTUDIANTE primary key (CODESTU)
);

/*==============================================================*/
/* Index: ESPACIO_ESTUDIANTE_FK                                 */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_ESTUDIANTE_FK on SPORTS_UNIT.ESTUDIANTE (
                                                                          CODESPACIO ASC
    );

/*==============================================================*/
/* Table: HORA                                                  */
/*==============================================================*/
create table SPORTS_UNIT.HORA
(
    IDHORA               VARCHAR2(2)          not null,
    constraint PK_HORA primary key (IDHORA)
);

/*==============================================================*/
/* Table: INSCRITOPRACLIBRE                                     */
/*==============================================================*/
create table SPORTS_UNIT.INSCRITOPRACLIBRE
(
    CONSECPROGRA         NUMBER(4,0)          not null,
    CONSECPRAC           NUMBER(4)            not null,
    CODESTU              VARCHAR2(12),
    CODEMPLEADO          VARCHAR2(4),
    constraint PK_INSCRITOPRACLIBRE primary key (CONSECPROGRA, CONSECPRAC)
);

/*==============================================================*/
/* Index: ESTUD_INSCRITO_FK                                     */
/*==============================================================*/
create index SPORTS_UNIT.ESTUD_INSCRITO_FK on SPORTS_UNIT.INSCRITOPRACLIBRE (
                                                                             CODESTU ASC
    );

/*==============================================================*/
/* Index: EMPLEADO_INSCRITOPRACLIBRE_FK                         */
/*==============================================================*/
create index SPORTS_UNIT.EMPLEADO_INSCRITOPRACLIBRE_FK on SPORTS_UNIT.INSCRITOPRACLIBRE (
                                                                                         CODEMPLEADO ASC
    );

/*==============================================================*/
/* Index: PROG_INSCRITO_FK                                      */
/*==============================================================*/
create index SPORTS_UNIT.PROG_INSCRITO_FK on SPORTS_UNIT.INSCRITOPRACLIBRE (
                                                                            CONSECPROGRA ASC
    );

/*==============================================================*/
/* Table: MARCA                                                 */
/*==============================================================*/
create table SPORTS_UNIT.MARCA
(
    IDMARCA              VARCHAR2(2)          not null,
    NOMMARCA             VARCHAR2(20)         not null,
    constraint PK_MARCA primary key (IDMARCA)
);

/*==============================================================*/
/* Table: MIEMBROEQUIPO                                         */
/*==============================================================*/
create table SPORTS_UNIT.MIEMBROEQUIPO
(
    CONSEEQUIPO          NUMBER(3,0)          not null,
    ITEMMIEMBRO          NUMBER(3,0)          not null,
    CODESTU              VARCHAR2(12),
    constraint PK_MIEMBROEQUIPO primary key (CONSEEQUIPO, ITEMMIEMBRO)
);

/*==============================================================*/
/* Index: MIEMBRO_EQUIPO_FK                                     */
/*==============================================================*/
create index SPORTS_UNIT.MIEMBRO_EQUIPO_FK on SPORTS_UNIT.MIEMBROEQUIPO (
                                                                         CONSEEQUIPO ASC
    );

/*==============================================================*/
/* Index: ESTUDIANTE_EQUIPO_FK                                  */
/*==============================================================*/
create index SPORTS_UNIT.ESTUDIANTE_EQUIPO_FK on SPORTS_UNIT.MIEMBROEQUIPO (
                                                                            CODESTU ASC
    );

/*==============================================================*/
/* Table: PERIODO                                               */
/*==============================================================*/
create table SPORTS_UNIT.PERIODO
(
    IDPERIODO            VARCHAR2(5)          not null,
    constraint PK_PERIODO primary key (IDPERIODO)
);

/*==============================================================*/
/* Table: PRESTAMO                                              */
/*==============================================================*/
create table SPORTS_UNIT.PRESTAMO
(
    CONSECPRESTAMO       NUMBER(4,0)          not null,
    CONSECPROGRA         NUMBER(4,0),
    CONSECRES            NUMBER(4,0),
    CONSECASISRES        NUMBER(4),
    CONSECELEMENTO       NUMBER(5),
    constraint PK_PRESTAMO primary key (CONSECPRESTAMO)
);

/*==============================================================*/
/* Index: ASISTIRRESPONSABLE_FK                                 */
/*==============================================================*/
create index SPORTS_UNIT.ASISTIRRESPONSABLE_FK on SPORTS_UNIT.PRESTAMO (
                                                                        CONSECPROGRA ASC,
                                                                        CONSECRES ASC,
                                                                        CONSECASISRES ASC
    );

/*==============================================================*/
/* Index: ELEMENTODEPORTIVO_PRESTAMO_FK                         */
/*==============================================================*/
create index SPORTS_UNIT.ELEMENTODEPORTIVO_PRESTAMO_FK on SPORTS_UNIT.PRESTAMO (
                                                                                CONSECELEMENTO ASC
    );

/*==============================================================*/
/* Table: PROGRAMACION                                          */
/*==============================================================*/
create table SPORTS_UNIT.PROGRAMACION
(
    CONSECPROGRA         NUMBER(4,0)          not null,
    IDDEPORTE            VARCHAR2(2),
    CODESPACIO           VARCHAR2(2),
    IDPERIODO            VARCHAR2(5),
    IDACTIVIDAD          VARCHAR2(2),
    IDHORA               VARCHAR2(2),
    HOR_IDHORA           VARCHAR2(2),
    IDDIA                VARCHAR2(1),
    CUPO                 NUMBER(3,0)          not null,
    NOINSCRITO           NUMBER(3,0),
    constraint PK_PROGRAMACION primary key (CONSECPROGRA)
);

/*==============================================================*/
/* Index: DEPORTE_PROGRAMACION_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.DEPORTE_PROGRAMACION_FK on SPORTS_UNIT.PROGRAMACION (
                                                                              IDDEPORTE ASC
    );

/*==============================================================*/
/* Index: ESPACIO_PROGRAMACION_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.ESPACIO_PROGRAMACION_FK on SPORTS_UNIT.PROGRAMACION (
                                                                              CODESPACIO ASC
    );

/*==============================================================*/
/* Index: PERIODO_PROGRAMACION_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.PERIODO_PROGRAMACION_FK on SPORTS_UNIT.PROGRAMACION (
                                                                              IDPERIODO ASC
    );

/*==============================================================*/
/* Index: ACTIVIDAD_PROGRAMACION_FK                             */
/*==============================================================*/
create index SPORTS_UNIT.ACTIVIDAD_PROGRAMACION_FK on SPORTS_UNIT.PROGRAMACION (
                                                                                IDACTIVIDAD ASC
    );

/*==============================================================*/
/* Index: HORAFIN_FK                                            */
/*==============================================================*/
create index SPORTS_UNIT.HORAFIN_FK on SPORTS_UNIT.PROGRAMACION (
                                                                 IDHORA ASC
    );

/*==============================================================*/
/* Index: HORAINICIO_FK                                         */
/*==============================================================*/
create index SPORTS_UNIT.HORAINICIO_FK on SPORTS_UNIT.PROGRAMACION (
                                                                    HOR_IDHORA ASC
    );

/*==============================================================*/
/* Index: DIA_PROGRAMACION_FK                                   */
/*==============================================================*/
create index SPORTS_UNIT.DIA_PROGRAMACION_FK on SPORTS_UNIT.PROGRAMACION (
                                                                          IDDIA ASC
    );

/*==============================================================*/
/* Table: RESPONSABLE                                           */
/*==============================================================*/
create table SPORTS_UNIT.RESPONSABLE
(
    CONSECPROGRA         NUMBER(4,0)          not null,
    CONSECRES            NUMBER(4,0)          not null,
    IDROL                VARCHAR2(1),
    CODEMPLEADO          VARCHAR2(4),
    CODESTU              VARCHAR2(12),
    FECHAINI             DATE                 not null,
    FECHAFIN             DATE                 not null,
    constraint PK_RESPONSABLE primary key (CONSECPROGRA, CONSECRES)
);

/*==============================================================*/
/* Index: ROL_RESPONSABLE_FK                                    */
/*==============================================================*/
create index SPORTS_UNIT.ROL_RESPONSABLE_FK on SPORTS_UNIT.RESPONSABLE (
                                                                        IDROL ASC
    );

/*==============================================================*/
/* Index: EMPLEADO_RESPONSABLE_FK                               */
/*==============================================================*/
create index SPORTS_UNIT.EMPLEADO_RESPONSABLE_FK on SPORTS_UNIT.RESPONSABLE (
                                                                             CODEMPLEADO ASC
    );

/*==============================================================*/
/* Index: ESTUDIANTE_RESPONSABLE_FK                             */
/*==============================================================*/
create index SPORTS_UNIT.ESTUDIANTE_RESPONSABLE_FK on SPORTS_UNIT.RESPONSABLE (
                                                                               CODESTU ASC
    );

/*==============================================================*/
/* Index: PROGRAMACION_RESPONSABLE_FK                           */
/*==============================================================*/
create index SPORTS_UNIT.PROGRAMACION_RESPONSABLE_FK on SPORTS_UNIT.RESPONSABLE (
                                                                                 CONSECPROGRA ASC
    );

/*==============================================================*/
/* Table: ROL                                                   */
/*==============================================================*/
create table SPORTS_UNIT.ROL
(
    IDROL                VARCHAR2(1)          not null,
    DESCROL              VARCHAR2(15)         not null,
    constraint PK_ROL primary key (IDROL)
);

/*==============================================================*/
/* Table: TIPOELEMENTO                                          */
/*==============================================================*/
create table SPORTS_UNIT.TIPOELEMENTO
(
    IDTIPOELEMENTO       VARCHAR2(2)          not null,
    DESCTIPOELEMENTO     VARCHAR2(40)         not null,
    constraint PK_TIPOELEMENTO primary key (IDTIPOELEMENTO)
);

/*==============================================================*/
/* Table: TIPOESPACIO                                           */
/*==============================================================*/
create table SPORTS_UNIT.TIPOESPACIO
(
    IDTIPOESPACIO        VARCHAR2(2)          not null,
    DESCTIPOESPACIO      VARCHAR2(30)         not null,
    constraint PK_TIPOESPACIO primary key (IDTIPOESPACIO)
);

alter table SPORTS_UNIT.ASISMIEMBROEQUIPO
    add constraint FK_ASISMIEM_MIEMBRO_A_MIEMBROE foreign key (CONSEEQUIPO, ITEMMIEMBRO)
        references SPORTS_UNIT.MIEMBROEQUIPO (CONSEEQUIPO, ITEMMIEMBRO);

alter table SPORTS_UNIT.ASISMIEMBROEQUIPO
    add constraint FK_ASISMIEM_PROGRAMAC_PROGRAMA foreign key (CONSECPROGRA)
        references SPORTS_UNIT.PROGRAMACION (CONSECPROGRA);

alter table SPORTS_UNIT.ASISTIRRESPONSABLE
    add constraint FK_ASISTIRR_RESPONSAB_RESPONSA foreign key (CONSECPROGRA, CONSECRES)
        references SPORTS_UNIT.RESPONSABLE (CONSECPROGRA, CONSECRES);

alter table SPORTS_UNIT.DEPORTE_TIPO
    add constraint FK_DEPORTE__DEPORTE_T_DEPORTE foreign key (IDDEPORTE)
        references SPORTS_UNIT.DEPORTE (IDDEPORTE);

alter table SPORTS_UNIT.DEPORTE_TIPO
    add constraint FK_DEPORTE__DEPORTE_T_TIPOELEM foreign key (IDTIPOELEMENTO)
        references SPORTS_UNIT.TIPOELEMENTO (IDTIPOELEMENTO);

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    add constraint FK_ELEMENTO_ELEMENTO__ESTADO foreign key (IDESTADO)
        references SPORTS_UNIT.ESTADO (IDESTADO);

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    add constraint FK_ELEMENTO_ELEMENTO__TIPOELEM foreign key (IDTIPOELEMENTO)
        references SPORTS_UNIT.TIPOELEMENTO (IDTIPOELEMENTO);

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    add constraint FK_ELEMENTO_ESPACIO_E_ESPACIO foreign key (CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.ELEMENTODEPORTIVO
    add constraint FK_ELEMENTO_MARCA_ELE_MARCA foreign key (IDMARCA)
        references SPORTS_UNIT.MARCA (IDMARCA);

alter table SPORTS_UNIT.EMPLEADO_CARGO
    add constraint FK_EMPLEADO_CARGO_EMP_CARGO foreign key (IDCARGO)
        references SPORTS_UNIT.CARGO (IDCARGO);

alter table SPORTS_UNIT.EMPLEADO_CARGO
    add constraint FK_EMPLEADO_EMPLEADO__EMPLEADO foreign key (CODEMPLEADO)
        references SPORTS_UNIT.EMPLEADO (CODEMPLEADO);

alter table SPORTS_UNIT.EMPLEADO_CARGO
    add constraint FK_EMPLEADO_ESPACIO_E_ESPACIO foreign key (CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.EQUIPO
    add constraint FK_EQUIPO_EMPLEADO__EMPLEADO foreign key (CODEMPLEADO)
        references SPORTS_UNIT.EMPLEADO (CODEMPLEADO);

alter table SPORTS_UNIT.EQUIPO
    add constraint FK_EQUIPO_EQUIPO_DE_DEPORTE foreign key (IDDEPORTE)
        references SPORTS_UNIT.DEPORTE (IDDEPORTE);

alter table SPORTS_UNIT.ESPACIO
    add constraint FK_ESPACIO_ESPACIO_E_ESPACIO foreign key (ESP_CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.ESPACIO
    add constraint FK_ESPACIO_TIPO_ESPA_TIPOESPA foreign key (IDTIPOESPACIO)
        references SPORTS_UNIT.TIPOESPACIO (IDTIPOESPACIO);

alter table SPORTS_UNIT.ESPACIO_DEPORTE
    add constraint FK_ESPACIO__ESPACIO_D_ESPACIO foreign key (CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.ESPACIO_DEPORTE
    add constraint FK_ESPACIO__ESPACIO_D_DEPORTE foreign key (IDDEPORTE)
        references SPORTS_UNIT.DEPORTE (IDDEPORTE);

alter table SPORTS_UNIT.ESTUDIANTE
    add constraint FK_ESTUDIAN_ESPACIO_E_ESPACIO foreign key (CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    add constraint FK_INSCRITO_EMPLEADO__EMPLEADO foreign key (CODEMPLEADO)
        references SPORTS_UNIT.EMPLEADO (CODEMPLEADO);

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    add constraint FK_INSCRITO_ESTUDIANT_ESTUDIAN foreign key (CODESTU)
        references SPORTS_UNIT.ESTUDIANTE (CODESTU);

alter table SPORTS_UNIT.INSCRITOPRACLIBRE
    add constraint FK_INSCRITO_PROGRAMAC_PROGRAMA foreign key (CONSECPROGRA)
        references SPORTS_UNIT.PROGRAMACION (CONSECPROGRA);

alter table SPORTS_UNIT.MIEMBROEQUIPO
    add constraint FK_MIEMBROE_ESTUDIANT_ESTUDIAN foreign key (CODESTU)
        references SPORTS_UNIT.ESTUDIANTE (CODESTU);

alter table SPORTS_UNIT.MIEMBROEQUIPO
    add constraint FK_MIEMBROE_MIEMBRO_E_EQUIPO foreign key (CONSEEQUIPO)
        references SPORTS_UNIT.EQUIPO (CONSEEQUIPO);

alter table SPORTS_UNIT.PRESTAMO
    add constraint FK_PRESTAMO_ASISTIRRE_ASISTIRR foreign key (CONSECPROGRA, CONSECRES, CONSECASISRES)
        references SPORTS_UNIT.ASISTIRRESPONSABLE (CONSECPROGRA, CONSECRES, CONSECASISRES);

alter table SPORTS_UNIT.PRESTAMO
    add constraint FK_PRESTAMO_ELEMENTOD_ELEMENTO foreign key (CONSECELEMENTO)
        references SPORTS_UNIT.ELEMENTODEPORTIVO (CONSECELEMENTO);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_ACTIVIDAD_ACTIVIDA foreign key (IDACTIVIDAD)
        references SPORTS_UNIT.ACTIVIDAD (IDACTIVIDAD);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_DEPORTE_P_DEPORTE foreign key (IDDEPORTE)
        references SPORTS_UNIT.DEPORTE (IDDEPORTE);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_DIA_PROGR_DIA foreign key (IDDIA)
        references SPORTS_UNIT.DIA (IDDIA);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_ESPACIO_P_ESPACIO foreign key (CODESPACIO)
        references SPORTS_UNIT.ESPACIO (CODESPACIO);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_HORAFIN_HORA foreign key (IDHORA)
        references SPORTS_UNIT.HORA (IDHORA);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_HORAINICI_HORA foreign key (HOR_IDHORA)
        references SPORTS_UNIT.HORA (IDHORA);

alter table SPORTS_UNIT.PROGRAMACION
    add constraint FK_PROGRAMA_PERIODO_P_PERIODO foreign key (IDPERIODO)
        references SPORTS_UNIT.PERIODO (IDPERIODO);

alter table SPORTS_UNIT.RESPONSABLE
    add constraint FK_RESPONSA_EMPLEADO__EMPLEADO foreign key (CODEMPLEADO)
        references SPORTS_UNIT.EMPLEADO (CODEMPLEADO);

alter table SPORTS_UNIT.RESPONSABLE
    add constraint FK_RESPONSA_ESTUDIANT_ESTUDIAN foreign key (CODESTU)
        references SPORTS_UNIT.ESTUDIANTE (CODESTU);

alter table SPORTS_UNIT.RESPONSABLE
    add constraint FK_RESPONSA_PROGRAMAC_PROGRAMA foreign key (CONSECPROGRA)
        references SPORTS_UNIT.PROGRAMACION (CONSECPROGRA);

alter table SPORTS_UNIT.RESPONSABLE
    add constraint FK_RESPONSA_ROL_RESPO_ROL foreign key (IDROL)
        references SPORTS_UNIT.ROL (IDROL);

grant all privileges to SPORTS_UNIT, SYS;
